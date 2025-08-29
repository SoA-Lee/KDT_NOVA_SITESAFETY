package org.example.nova.apartment.controller;

import org.example.nova.apartment.dto.ElevatorCallRequestToApartmentServer;
import org.example.nova.apartment.dto.ElevatorStatusGetRequestToApartmentServer;
import org.example.nova.apartment.dto.ElevatorStatusResponseFromApartmentServer;
import org.example.nova.apartment.service.ElevatorStatusGetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apartment")
public class ElevatorController {

    private final ElevatorStatusGetService goodElevatorStatusGetService;
    private final ElevatorStatusGetService badElevatorStatusGetService;

    public ElevatorController(@Qualifier("goodElevatorStatusGetService") ElevatorStatusGetService goodElevatorStatusGetService,
                              @Qualifier("badElevatorStatusGetService") ElevatorStatusGetService badElevatorStatusGetService) {
        this.goodElevatorStatusGetService = goodElevatorStatusGetService;
        this.badElevatorStatusGetService = badElevatorStatusGetService;
    }

    @GetMapping("/good/elevator/{dong}/{hogi}")
    public ElevatorStatusResponseFromApartmentServer getGoodElevatorStatus(@PathVariable String dong, @PathVariable String hogi) {
        ElevatorStatusGetRequestToApartmentServer request = new ElevatorStatusGetRequestToApartmentServer(dong, hogi);
        return goodElevatorStatusGetService.getElevatorStatus(request);
    }

    @GetMapping("/bad/elevator/{dong}/{hogi}")
    public ElevatorStatusResponseFromApartmentServer getBadElevatorStatus(@PathVariable String dong, @PathVariable String hogi) {
        ElevatorStatusGetRequestToApartmentServer request = new ElevatorStatusGetRequestToApartmentServer(dong, hogi);
        return badElevatorStatusGetService.getElevatorStatus(request);
    }

    @PostMapping("/good/elevator/call")
    public ResponseEntity<Void> callElevatorToGood(@RequestBody ElevatorCallRequestToApartmentServer elevatorCallRequestToApartmentServer) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/bad/elevator/call")
    public ResponseEntity<Void> callElevatorToBad(@RequestBody ElevatorCallRequestToApartmentServer elevatorCallRequestToApartmentServer) {
        return ResponseEntity.ok().build();
    }
}
