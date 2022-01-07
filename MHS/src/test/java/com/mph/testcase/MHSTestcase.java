package com.mph.testcase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.mph.model.Hall;
import com.mph.view.Main;



@RunWith(Suite.class)
@SuiteClasses({Hall.class,Main.class})
public class MHSTestcase {

}
