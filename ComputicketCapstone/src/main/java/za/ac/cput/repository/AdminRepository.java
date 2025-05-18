package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements iAdminRepository{

    private static iAdminRepository repository = null;
    private List<User> UsersList;


    private AdminRepository() {
        UsersList = new ArrayList<User>();
    }

    public static AdminRepository getRepository(){
        if(repository == null){
            repository = new AdminRepository();
        }
    }


    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User read(String s) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }

}
