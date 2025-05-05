package space.jojoh.fc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import space.jojoh.fc.entity.Fleet;
import space.jojoh.fc.repository.FleetRepository;

@RestController
@RequestMapping("/fleets")
public class FleetController {

    private final FleetRepository fleetRepository;

    public FleetController(FleetRepository fleetRepository) {
        this.fleetRepository = fleetRepository;
    }

    @GetMapping
    public List<Fleet> getAllFleets() {
        return fleetRepository.findAll();
    }

    @PostMapping
    public Fleet createFleet(@RequestBody Fleet fleet) {
        return fleetRepository.save(fleet);
    }
}
