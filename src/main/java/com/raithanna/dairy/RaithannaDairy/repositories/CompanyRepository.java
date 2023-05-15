package com.raithanna.dairy.RaithannaDairy.repositories;
import com.raithanna.dairy.RaithannaDairy.models.company;
import com.raithanna.dairy.RaithannaDairy.models.supplier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CompanyRepository extends CrudRepository<company,Integer> {
    List<company> findByOrderByIdDesc();
    company findByOrgCode(String orgCode);
}
