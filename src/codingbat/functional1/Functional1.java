package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

public class Functional1 {

   /* Functional-1 > doubling
    prev  |  next  |  chance
    Given a list of integers, return a list where each integer is multiplied by 2.
    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    doubling([]) → [] */
public List<Integer> doubling(List<Integer> nums) {
    nums.replaceAll(n ->n*2);
    return nums;
}

    /* Functional-1 > square
    Given a list of integers, return a list where each integer is multiplied with itself.
            square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → [] */
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }

    /*
    Functional-1 > addStar
prev  |  next  |  chance
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
     */

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(a -> a.concat("*"));
        return strings;
    }


    /*
    Functional-1 > copies3
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
     */
    public List<String> copies3(List<String> strings) {
        List<String> somelist = new ArrayList<>();
        strings.forEach(s -> somelist.add(s+s+s));
        return somelist;
    }

        /*
Functional-1 > moreY
Given a list of strings, return a list where each string has "y" added at its start and end.
        moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
         */
        public List<String> moreY(List<String> strings) {
            List<String> somelist = new ArrayList<>();
            strings.forEach(s -> somelist.add("y".concat(s).concat("y")));
            return somelist;
        }

        /*
        Functional-1 > math1
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
         */
        public List<Integer> math1(List<Integer> nums) {
            List<Integer> numsList = nums.stream().map(num-> 10*(num+1)).collect(Collectors.toList());
            return numsList;

        }

}
