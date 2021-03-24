package com.example.myunittesting

class CuboidModel {
    private var length: Double = 0.0
    private var width: Double = 0.0
    private var height: Double = 0.0

    fun save(length: Double, width: Double, height: Double) {
        this.length = length
        this.height = height
        this.width = width
    }

    fun getVolume(): Double = length * width * height

    fun getSurfaceArea(): Double {
        val lw = length * width
        val wh = width * height
        val lh = length * height

        return 2 * (lw + wh + lh)
    }

    fun getCircumference(): Double = 4 * (length + width + height)
}