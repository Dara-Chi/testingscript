/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edems;

import entity.EmsEmployeeDTO;
import java.math.BigDecimal;
import javax.ejb.EJB;
import session.EmsEmployeeFacadeRemote;
import util.MyHash;

/**
 *
 * @author Dara
 */
public class EmsEmployeeAppClient {

    @EJB
    private static EmsEmployeeFacadeRemote emsEmployeeFacade;

    //valid test case
    String empid = "001102";
    String name = "a";
    String memo = "12345678";
    String password = (String) MyHash.getSHA256HashedString(memo);
    String email = "a";
    String phone = "a";
    String address = "a";
    String secqn = "a";
    String secans = "a";
    String bsbid = "101111";
    String accid = "111";
    BigDecimal salary = new BigDecimal(20000);
    String appgroup = "ED-EMS-USERS";
    Boolean active = true;

    public EmsEmployeeAppClient() {
    }

    public static void main(String[] args) {
        EmsEmployeeAppClient client = new EmsEmployeeAppClient();
        try {
            client.testCaseEmpid01();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid01 :" + ex);
        }
        try {
            client.testCaseEmpid02();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid02 :" + ex);
        }
        try {
            client.testCaseEmpid03();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid03 :" + ex);
        }
        try {
            client.testCaseEmpid04();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid04 :" + ex);
        }
        try {
            client.testCaseEmpid05();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid05 :" + ex);
        }

        try {
            client.testCaseEmpid06();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid06 :" + ex);
        }

        try {
            client.testCaseEmpid07();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid07 :" + ex);
        }

        try {
            client.testCaseEmpid08();
        } catch (Exception ex) {
            System.out.print("testCaseEmpid08 :" + ex);
        }

        try {
            client.testCaseSalary01();
        } catch (Exception ex) {
            System.out.print("testcaseSalary01 : " + ex);
        }

        try {
            client.testCaseSalary02();
        } catch (Exception ex) {
            System.out.print("testcaseSalary02 : " + ex);
        }

        try {
            client.testCaseSalary03();
        } catch (Exception ex) {
            System.out.print("testcaseSalary03 : " + ex);
        }

        try {
            client.testCaseSalary04();
        } catch (Exception ex) {
            System.out.print("testcaseSalary04 : " + ex);
        }

        try {
            client.testCaseSalary05();
        } catch (Exception ex) {
            System.out.print("testcaseSalary05 : " + ex);
        }

        try {
            client.testCaseAppgroup01();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup01 : " + ex);
        }

        try {
            client.testCaseAppgroup02();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup02 : " + ex);
        }

        try {
            client.testCaseAppgroup03();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup03 : " + ex);
        }

        try {
            client.testCaseAppgroup04();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup04 : " + ex);
        }

        try {
            client.testCaseAppgroup05();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup05 : " + ex);
        }

        try {
            client.testCaseAppgroup06();
        } catch (Exception ex) {
            System.out.print("testcaseAppgroup06 : " + ex);
        }

//        client.testcaseAppgroup01();
//        client.testcaseAppgroup02();
//        client.testcaseAppgroup03();
//        client.testcaseAppgroup04();
//        client.testcaseAppgroup05();
//        client.testcaseAppgroup06();
//        EmsEmployeeAppClient client = new EmsEmployeeAppClient();
//        EmsEmployeeDTO dto;
//        dto = client.testCase01();
//            if (client.createRecord(dto)) {
//                System.out.print("test case 01 successed");
//            } else {
//                System.out.print("test case 01 failed");
//            }
//        EmsEmployeeAppClient client = new EmsEmployeeAppClient();
//        // assuming inputs from keyboard or any GUI
//        String memo1 = "789016";
//        String pwd1 = MyHash.getSHA256HashedString(memo1);
//        EmsEmployeeDTO emsEmployeeDTO = new EmsEmployeeDTO("000007", "Robert Banner",
//                pwd1, "rbanner@swin.edu.au", "7654321098", "Swinburne EN516a",
//                "What is my name?", "Robert", "321456", "98701234", new BigDecimal(99000.0),
//                "ED-EMS-USERS", true, memo1);
//        boolean result = client.createRecord(emsEmployeeDTO);
//        client.showCreateResult(result, emsEmployeeDTO);
//// assuming inputs from keyboard or any GUI
//        String memo2 = "123456";
//        String pwd2 = MyHash.getSHA256HashedString(memo2);
//        EmsEmployeeDTO emsEmployeeDTO2 = new EmsEmployeeDTO("000001", "Man Lau",
//                pwd2, "elau@swin.edu.au", "9876543210", "Swinburne EN510a",
//                "What is my name?", "Man", "123456", "12345678", new BigDecimal(50000.0),
//                "ED-EMS-ADMIN", true, memo2);
//        result = client.createRecord(emsEmployeeDTO2);
//        client.showCreateResult(result, emsEmployeeDTO2);
//
////       Test get record
//        System.out.println("Retrieve a record of employee 000001");
//        EmsEmployeeDTO foundEmployee = emsEmployeeFacade.getRecord("000001");
//        if (foundEmployee != null) {
//            System.out.println(foundEmployee.getName() + " found!");
//        }
//        System.out.println("Retrieve a non-existent record");
//        foundEmployee = emsEmployeeFacade.getRecord("024101");
//        if (foundEmployee == null) {
//            System.out.println("Employee record can't be found");
//        }
//        System.out.println("----------------------------------------");
////       Test update record
//        System.out.println("Updating 000001 to be Draco Malfoy");
//        emsEmployeeDTO2 = new EmsEmployeeDTO(
//                "000001", "Draco Malfoy", pwd2, "elau@swin.edu.au", "9876543210", "Swinburne EN510a",
//                "What is my name?", "Man", "123456", "12345678", new BigDecimal(50000.0),
//                "ED-EMS-ADMIN", true, memo2);
//        if (emsEmployeeFacade.updateRecord(emsEmployeeDTO2)) {
//            System.out.println("Update successfully!");
//        } else {
//            System.out.println("Update failed");
//        }
//        System.out.println("Try updating non-existent record");
//        emsEmployeeDTO2 = new EmsEmployeeDTO(
//                "000092", "Draco Malfoy", pwd2, "elau@swin.edu.au", "9876543210", "Swinburne EN510a",
//                "What is my name?", "Man", "123456", "12345678", new BigDecimal(50000.0),
//                "ED-EMS-ADMIN", true, memo2);
//        if (!emsEmployeeFacade.updateRecord(emsEmployeeDTO2)) {
//            System.out.println("Update failed");
//        }
//        System.out.println("----------------------------------------");
////        Test delete record
//        System.out.println("Deleting 000007 from the database");
//        if (emsEmployeeFacade.deleteRecord("000007")) {
//            System.out.println("Deleted!");
//        } else {
//            System.out.println("Delete failed");
//        }
//        System.out.println("Deleting non existent record");
//        if (emsEmployeeFacade.deleteRecord("000307")) {
//            System.out.println("Deleted!");
//        } else {
//            System.out.println("Delete failed");
//        }
//        System.out.println("----------------------------------------");
////        Test retrieve group
//        System.out.println("Retrieve all ED-EMS-ADMIN employees");
//        ArrayList<EmsEmployeeDTO> foundEmployees = emsEmployeeFacade.getEmployeesByAppgroup("ED-EMS-ADMIN");
//        if(foundEmployees == null){
//            System.out.println("None can be found");
//        }else{
//            System.out.println(foundEmployees.size() + " employees found!");
//        }
//        System.out.println("Retrieve a group that doesn't exist");
//        ArrayList<EmsEmployeeDTO> foundEmployees2 = emsEmployeeFacade.getEmployeesByAppgroup("None");
//        if(foundEmployees2 == null){
//            System.out.println("None can be found");
//        }else{
//            System.out.println(foundEmployees.size() + " employees found!");
//        }
    }

    public void showCreateResult(boolean result, EmsEmployeeDTO emsEmployeeDTO) {
        if (result) {
            System.out.println("Record with primary key " + emsEmployeeDTO.getEmpid()
                    + " has been created in the database table.");
        } else {
            System.out.println("Record with primary key " + emsEmployeeDTO.getEmpid()
                    + " could not be created in the database table!");
        }
    }

    public Boolean createRecord(EmsEmployeeDTO emsEmployeeDTO) {

        return emsEmployeeFacade.createRecord(emsEmployeeDTO);

    }

    //successful case
    public boolean testCaseEmpid01() throws Exception {
        boolean result = false;
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase01 record created successfully and testcase passed.\n");
            } else {
                System.out.print("testCase01 record created failed and test case failed\n");
            }

        } catch (Exception ex) {
            System.err.print("testCaseEmpid01 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }

    //failed case
    public boolean testCaseEmpid02() throws Exception {
        boolean result = false;
        empid = "";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase02 record created successfully and test case failed\n");
            } else {
                System.out.print("testCase02 record created failed and testcase passed \n");
            }

        } catch (Exception ex) {
            System.err.print("testCaseEmpid02 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }
//failed testcase

    public boolean testCaseEmpid03() throws Exception {
        boolean result = false;
        empid = "one";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase03 record created successfully  and test case failed\n");
            } else {
                System.out.print("testCase03 record created failed and testcase passed \n");
            }

        } catch (Exception ex) {
            System.err.print(" testCaseEmpid03 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }

    //failed testcase
    public boolean testCaseEmpid04() throws Exception {
        boolean result = false;
        empid = "#";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase04 record created successfully and test case failed\n");
            } else {
                System.out.print("testCase04 record created failed and test case passed\n");
            }

        } catch (Exception ex) {
            System.err.print("testCaseEmpid04 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }
//failed testcase

    public boolean testCaseEmpid05() throws Exception {
        boolean result = false;
        empid = "";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase05 record created successfully and test case failed \n");
            } else {
                System.out.print("testCase05 record created failed and test case passed\n");
            }

        } catch (Exception ex) {
            System.err.print("testCaseEmpid05 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }
//failed test case

    public boolean testCaseEmpid06() throws Exception {
        boolean result = false;
        empid = null;
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase06 record created successfully and test case failed \n");
            } else {
                System.out.print("testCase06 record created failed and test case passed \n");
            }

        } catch (Exception ex) {
            System.err.print("testCaseEmpid06 : input format exception." + ex + "\n");
        }
        return this.createRecord(dto);
    }
//failed test case

    public boolean testCaseEmpid07() throws Exception {
        boolean result = false;
        empid = "000000";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase07 record created successfully and test case failed \n");
            } else {
                System.out.print("testCase07 record created failed and test case passed \n");
            }
        } catch (Exception ex) {
            System.err.print("testCaseEmpid07 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);
    }
//failed test case

    public boolean testCaseEmpid08() throws Exception {
        boolean result = false;
        empid = "000001";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCase08 record created successfully test case failed \n");
            } else {
                System.out.print("testCase08 record created failed and test case passed\n");
            }
        } catch (Exception ex) {
            System.err.print("testCaseEmpid08 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);
    }
//successful test case

    public boolean testCaseSalary01() throws Exception {
        boolean result = false;
        empid = "001103";
        salary = new BigDecimal(10000);
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCaseSalary01 record created successfully and test case passed \n");
            } else {
                System.out.print("testCaseSalary01 record created failed and test case failed \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseSalary01() : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//successfull test case

    public boolean testCaseSalary02() throws Exception {
        boolean result = false;
        empid = "001104";
        salary = new BigDecimal(10000.00);
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCaseSalary02 record created successfully and test case passed\n");
            } else {
                System.out.print("testCaseSalary02 record created failed and test case failed \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseSalary02() : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//failed test case

    public boolean testCaseSalary03() throws Exception {
        boolean result = false;
        empid = "001105";
        salary = new BigDecimal(-10000);
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCaseSalary03 record created successfully and test case failed  \n");
            } else {
                System.out.print("testCaseSalary03 record created failed and test case passed\n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseSalary03() : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//failed test case

    public boolean testCaseSalary04() throws Exception {
        boolean result = false;
        empid = "001107";
        salary = new BigDecimal("");
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            
            if (this.createRecord(dto)) {
                System.out.print("testCaseSalary04 record created successfully and test case failed  \n");

            } else {
                System.out.print("testCaseSalary04 record created failed and test case passed \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseSalary04 :input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//failed test case

    public boolean testCaseSalary05() throws Exception {
        boolean result = false;
        empid = "001108";
        salary = new BigDecimal("null");
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testCaseSalary05 record created successfully and test case failed\n");
            } else {
                System.out.print("testCaseSalary05 record created failed and test case passed  \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseSalary05 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
// failed test case

    public boolean testCaseAppgroup01() throws Exception {
        boolean result = false;
        empid = "001109";
        appgroup = "";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup01 record created successfully and test case failed \n");
            } else {
                System.out.print("testcaseAppgroup01 record created failed and test case passed\n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup01 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//failed test case

    public boolean testCaseAppgroup02() throws Exception {
        boolean result = false;
        empid = "001110";
        appgroup = "#";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup02 record created successfully and test case failed \n");
            } else {
                System.out.print("testcaseAppgroup02 record created failed and test case passed \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup02 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//failed test case

    public boolean testCaseAppgroup03() throws Exception {
        boolean result = false;
        empid = "001111";
        appgroup = null;
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup03 record created successfully and test case failed\n");
            } else {
                System.out.print("testcaseAppgroup03 record created failed and test case passed\n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup03 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);

    }
//successful test case

    public boolean testCaseAppgroup04() throws Exception {
        boolean result = false;
        empid = "001112";
        appgroup = "ED-EMS-NONE";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup04 record created successfully and test case failed\n");
            } else {
                System.out.print("testcaseAppgroup04 record created failed and test case passed \n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup04 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);
    }
//successful test case

    public boolean testCaseAppgroup05() throws Exception {
        boolean result = false;
        empid = "001113";
        appgroup = "ED-EMS-ADMIN";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup05 record created successfully and test case passed\n");
            } else {
                System.out.print("testcaseAppgroup05 record created failed and test case failed\n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup05 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);
    }
//test case

    public boolean testCaseAppgroup06() throws Exception {
        boolean result = false;
        empid = "001114";
        appgroup = "ED-EMS-USER";
        EmsEmployeeDTO dto = new EmsEmployeeDTO(empid, name, password, email, phone, address, secqn, secans, bsbid, accid, salary, appgroup, active, memo);
        try {
            if (this.createRecord(dto)) {
                System.out.print("testcaseAppgroup06 record created successfully and test case passed\n");
            } else {
                System.out.print("testcaseAppgroup06 record created failed and test case failed\n");
            }
        } catch (Exception ex) {
            System.err.print("testcaseAppgroup06 : input format exception." + ex + "\n");
        }

        return this.createRecord(dto);
    }

}
