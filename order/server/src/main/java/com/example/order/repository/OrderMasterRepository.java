package com.example.order.repository;

import com.example.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author THY
 * @date 2018/12/2
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}
