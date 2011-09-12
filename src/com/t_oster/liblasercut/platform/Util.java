/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t_oster.liblasercut.platform;

/**
 *
 * @author oster
 */
public class Util {

    public static double inch2mm(double inch) {
        return inch * 25.4;
    }

    public static double mm2inch(double mm) {
        return mm / 25.4;
    }

    public static double px2mm(double px, double dpi) {
        return inch2mm(px / dpi);
    }

    public static double mm2px(double mm, double dpi) {
        return mm2inch(mm) * dpi;
    }

    /**
     * Returns true iff the given objects are not equal
     * This method is used to avoid null checks
     * @param a
     * @param b
     * @return 
     */
    public static boolean differ(Object a, Object b) {
        if (a == null ^ b == null) {
            return true;
        } else {
            if (a == null && b == null) {
                return false;
            } else {
                return !a.equals(b);
            }
        }
    }

    public static Byte reverseBitwise(Byte get) {
        return (byte) (Integer.reverse(get) >>> (Integer.SIZE - Byte.SIZE));
    }
}
