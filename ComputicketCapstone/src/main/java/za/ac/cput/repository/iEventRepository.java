package za.ac.cput.repository;

import za.ac.cput.domain.Event;
import za.ac.cput.domain.Venue;

import java.util.List;

public interface iEventRepository extends iRepository <Event,String> {

    List<Event> getAll();
}
