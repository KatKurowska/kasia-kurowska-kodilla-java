package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: start");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: start");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseOddNumbersSelection() {
        //Given
        ArrayList<Integer> numbers1 = new ArrayList<>();

        OddNumbersExterminator sampleNumbers1 = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = sampleNumbers1.exterminate(numbers1);
        System.out.println("Test succeds if the list is empty.");

        //Then
        Assert.assertTrue(result.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(15);
        numbers2.add(62);
        numbers2.add(-128);
        numbers2.add(37);
        numbers2.add(12);
        numbers2.add(58);

        OddNumbersExterminator sampleNumbers2 = new OddNumbersExterminator();

        ArrayList<Integer> expectedArrayList = new ArrayList();
        expectedArrayList.add(62);
        expectedArrayList.add(-128);
        expectedArrayList.add(12);
        expectedArrayList.add(58);

        //When
        ArrayList<Integer> result = sampleNumbers2.exterminate(numbers2);
        System.out.println("Test succeds if list consists only even numbers: " + result);

        //Then
        Assert.assertEquals(result,expectedArrayList);

        }
    }





