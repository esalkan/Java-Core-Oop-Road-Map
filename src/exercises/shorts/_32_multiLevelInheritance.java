package exercises.shorts;

// Super/Parent Class
class Person{}

// Sub/Child Class of Person
class Employee extends Person{}

// Sub/Child class of Employee Class
class Tester extends  Employee{}

// Sub/Child class of Employee Class
class Developer extends Employee{}

// Child class of Tester Class
class ManualTester extends  Tester{}

// Child Class of Tester Class
class AutomationTester extends Tester{}

// Child Class of developer Class
class FrontEndDeveloper extends Developer{}

// Child Class of developer Class --> at the same time Employee is super class for developer
class BackEndDeveloper extends Developer{}

public class _32_multiLevelInheritance {
}

