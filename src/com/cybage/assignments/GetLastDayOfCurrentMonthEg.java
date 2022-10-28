package com.cybage.assignments;

import java.util.Date;

public class GetLastDayOfCurrentMonthEg
{
	
    public static void main(String[] args) 
    {
       
        Date lastDate = DateUtil.getLastDayOfCurrentMonth();

        System.out.println("Today: " + new Date());
        System.out.println("Last Date of current month: " + lastDate);
    }
}
