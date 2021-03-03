package com.github.asirikusal.rest.dto;

import com.github.asirikusal.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Asiri
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

	CustomerDto mapCustomerToDto(Customer customer);

	Customer mapeDtoToCustomer(CustomerDto customerDto);
}
