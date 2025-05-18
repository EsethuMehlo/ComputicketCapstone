package za.ac.cput.repository;

import za.ac.cput.domain.User;

public interface iRepository<C, ID> {

    C create(C c);

    C read(ID id);

    C update(C c);

    boolean delete(ID id);
}
