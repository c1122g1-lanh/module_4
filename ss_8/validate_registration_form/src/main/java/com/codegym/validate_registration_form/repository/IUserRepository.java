package com.codegym.validate_registration_form.repository;

import com.codegym.validate_registration_form.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User, Integer> {
}
