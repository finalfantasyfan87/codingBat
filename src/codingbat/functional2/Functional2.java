package codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    /*
Functional-2 > noNeg
Given a list of integers, return a list of the integers, omitting any that are less than 0.
noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
     */
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> noNegs = nums.stream().filter(num -> num >= 0).collect(Collectors.toList());
        return noNegs;
    }
    /*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
     */

    public List<Integer> no9(List<Integer> nums) {
        List<Integer> noNines = nums.stream().filter(n-> n%10 != 9).collect(Collectors.toList());
        return noNines;
    }

    /*
    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
     */
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n->!( n>=13 && n<=19)).collect(Collectors.toList());
    }

    /*

Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !(s.contains("z"))).collect(Collectors.toList());
    }
    /*

Given a list of strings, return a list of the strings, omitting any string length 4 or more.


noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
     */

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> !(s.length() >4)).collect(Collectors.toList());
    }

}