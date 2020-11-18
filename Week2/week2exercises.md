#Q1
Quiz completed

#Q2 - Complexity of adding a single element to a dynamic array of size n, complexity of adding n elements?
Adding a single element to a dynamic array of size n has the worst complexity `O(n)` this worst case is doubling the array when we add our element. When we add n element to a array with the size n we will have to complexity of `O(2n)` and since n is the dominant term we can say that our complexity is `O(n)`.

#Q3 - Suppose we want to be able to delete elements from a dynamic array. If we want to delete an arbitrary element, what is the complexity (in the size of the array)? What if deletion is allowed to change the order of the elements in the array?
We assume that our dynamic array is the size n and we want to delete a "godtyckligt" element found in this array. We would need to step through the entire dynamic array. Therefore our worst case would be n steps, the complexity then is `O(n)`. If we don't have to take the order of the array in mind when looking for our element we can swap our element with the last element in the list and remove it then. This would give us the complexity `O(1)` since we have no recursion or loops.

#Q4 - This question is about adding an operation to dynamic arrays that deletes the last element of the array.
1. The reason for this is because our dynamic arrays keep pointers for both the first and our last element. We can then remove the last with the complexity of `O(1)`. 
2. The reason for this is because we are not resizing our array when removing the last element. We then can keep on removing elements without shortening the array.
3. I'd imaginge this is because when you are removing half the array when its half full and then adding an element directly after we are doing two resizes after eachother. Sequence would look as followed -> list.remove(5), list.append(2), list.remove(5), list.append(2). This would continue on forever and giving us awfull complexity.
4. Id change the rule to half the array when the array is 1/4 full. This would give us no n^2 complexity. 
5. potential method?

#Q5 - Suppose you have an array of n elements, then you can check if it has duplicate elements in O(n2) time by looping over every pair of elements. But if the array is sorted, you can do it in O(n) time. How?
You only have to step through the list once and comparing the current element with the next and see if its duplicated. This gives the complexity that is equal to the size of

