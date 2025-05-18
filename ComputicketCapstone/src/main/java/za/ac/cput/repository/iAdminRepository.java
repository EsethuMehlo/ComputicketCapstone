package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.List;

public interface iAdminRepository extends iRepository<User, String>{

    List<User> getAll();

}
