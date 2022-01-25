package com.hongxin.junit.sorttest.sort

object QuickSort {

    @JvmStatic
    fun main(args: Array<String>) {
        sort(arr)
    }

    private fun sort(arr: IntArray) {
        quickSort(arr, 0, arr.size - 1)

        for (i in arr) {
            print("$i   ")
        }
    }

    private fun quickSort(arr: IntArray, l: Int, r: Int) {

        if (l > r) {
            return
        }

        var i = l
        var j = r
        var base = arr[i]
        while (i < j) {
            while (i < j && arr[j] >= base) {
                j--
            }
            while (i < j && arr[i] <= base) {
                i++
            }

            if (i < j) {
                var tmp = arr[j]
                arr[j] = arr[i]
                arr[i] = tmp
            }
        }

        arr[l] = arr[i]
        arr[i] = base

        quickSort(arr, l, i - 1)
        quickSort(arr, i + 1, r)

    }
}