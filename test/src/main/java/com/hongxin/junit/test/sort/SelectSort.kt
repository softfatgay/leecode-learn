package com.hongxin.junit.sorttest.sort

object SelectSort {

    @JvmStatic
    fun main(args: Array<String>) {
        sort(arr)
    }

    private fun sort(arr: IntArray) {

        var count = 0;

        for (i in arr.indices) {
            var min = i
            for (j in i until arr.size) {
                if (arr[j] < arr[min]) {
                    min = j
                }
                count++
            }

            if (i != min) {
                var temp = arr[i]
                arr[i] = arr[min]
                arr[min] = temp
            }
        }


        for (i in arr) {
            print("$i   ")
        }
        println()
        println("循环次数 $count")
    }
}