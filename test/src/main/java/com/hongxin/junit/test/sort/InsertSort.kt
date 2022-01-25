package com.hongxin.junit.sorttest.sort

object InsertSort {

    @JvmStatic
    fun main(args: Array<String>) {
        sort(arr)
    }

    private fun sort(arr: IntArray) {

        var count = 0;
        for (i in arr.indices) {
            var tmp = arr[i]
            var j = i
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1]
                count++
                j--
            }

            if (j != i) {
                arr[j] = tmp
            }
        }
        for (i in arr) {
            print("$i   ")
        }
        println()
        println("循环次数 $count")

    }

}