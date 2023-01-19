package com.example.pirate99_final.store.service;


// TM 좌표를 WRS84 (경위도 좌표)로 바꿔주는 좌표 변환 외부 라이브러리
public class GeoPoint {
    double x;
    double y;
    double z;

    /**
     *
     */
    public GeoPoint() {
        super();
    }

    /**
     * @param x
     * @param y
     */
    public GeoPoint(double x, double y) {
        super();
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    /**
     * @param x
     * @param y
     * @param y
     */
    public GeoPoint(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
