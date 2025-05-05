package space.jojoh.fc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.jojoh.fc.entity.Fleet;

public interface FleetRepository extends JpaRepository<Fleet, Long> {
    // This interface will automatically provide CRUD operations for the Fleet entity
    // You can add custom query methods here if needed
    // For example, to find fleets by name:
    // List<Fleet> findByName(String name);
    // Or to find fleets by fleet boss:
    // List<Fleet> findByFleetBoss(String fleetBoss);
}
