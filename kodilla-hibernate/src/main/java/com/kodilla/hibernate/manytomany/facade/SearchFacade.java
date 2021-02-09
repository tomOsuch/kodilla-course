package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanies(final String letters){
        LOGGER.info("Searching companies by partname");
        List<Company> companies = companyDao.searchCompanyByPartName(letters);
        if (companies.size() == 0) {
            LOGGER.info("Cannot find such company name");
        }
        return companies;
    }

    public List<Employee> findEmployees(final String letters) {
        LOGGER.info("Searching employees by partname");
        List<Employee> employees = employeeDao.findByFewLetters(letters);
        if (employees.size() == 0) {
            LOGGER.info("Cannot find such employee name");
        }

        return employees;
    }
}
