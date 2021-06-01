package Java_8;

 

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

 

public class RemoveDuplicatesFromList {

                public static void main(String[] args) {

                                Integer a[] = {3,2,3,1,2,5,4,7,8,9,6,5,4,6,7,8,6,4,3,2,3,1,2,4,1,2};

                                List<Integer> integerList = Arrays.asList(a);

                               

                                System.out.println("Array with unique and ordered values: " + integerList.stream().distinct().sorted().collect(Collectors.toList()));

                }

}

