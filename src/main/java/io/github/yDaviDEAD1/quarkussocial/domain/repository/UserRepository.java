package io.github.yDaviDEAD1.quarkussocial.domain.repository;

import io.github.yDaviDEAD1.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {


}
