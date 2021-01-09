# Arrays
## Problem 1 : Duplicate Zeroes
Given a fixed length array `arr` of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array **in place**, do not return anything from your function.

Example 1:
```
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
```
Example 2:
```
Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
```
**Duplicate Zeroes[Solution]()**

## Problem 2 :  Merge Sorted Array
Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

The number of elements initialized in `nums1` and `nums2` are `m` and `n` respectively. You may assume that `nums1` has enough space (size that is equal to `m + n`) to hold additional elements from `nums2`.

Example 1:
```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
```
Example 2:
```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
```
**Merge Sorted Array - [Solution]()**