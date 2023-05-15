package com.raithanna.dairy.RaithannaDairy.repositories;

import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.supplier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SupplierRepository extends CrudRepository<supplier,Integer> {
   List<supplier> findByOrderByIdDesc();
   @Query("select * from  supplier where supplierCode=?1 ")
   supplier findBySupplierCode(String supplierCode);
  // @Query("select * from  supplier where supplierName=?1 ")
   //supplier findBySupplierName(String supplierName);
}
