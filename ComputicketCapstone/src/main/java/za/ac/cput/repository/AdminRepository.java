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

    public static iAdminRepository getRepository(){
        if(repository == null){
            repository = new AdminRepository();
        }
        return repository;
    }


    @Override
    public User create(User user) {
        boolean success = UsersList.add(user);
        if (success) {
            return user;
        }
        return null;
    }

    @Override
    public User read(String username) {
        for (User user : UsersList) {
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }
// lamda
    @Override
    public User update(User user) {
        String oldUserId = user.getUsername();
        User oldUser = read(oldUserId);
        if (oldUser == null) {
            return null;
        }
        boolean success = delete(oldUserId);
        if (success) {
            if (UsersList.add(user)){
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        User userToDelete = read(s);
        if (userToDelete == null) {
            return false;
        }
        return UsersList.remove(userToDelete);
    }

    @Override
    public List<User> getAll() {
        return UsersList;
    }

}
