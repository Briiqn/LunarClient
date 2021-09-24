package com.moonsworth.lunar.bridge.minecraft.util;

public class Vector3f {
    public static Vector3f lIlIlIlIlIIlIIlIIllIIIIIl = new Vector3f(1.0f, 0.0f, 0.0f);
    public static Vector3f IlllIIIIIIlllIlIIlllIlIIl = new Vector3f(-1.0f, 0.0f, 0.0f);
    public static Vector3f lIllIlIIIlIIIIIIIlllIlIll = new Vector3f(0.0f, -1.0f, 0.0f);
    public static Vector3f llIlllIIIllllIIlllIllIIIl = new Vector3f(0.0f, 1.0f, 0.0f);
    public static Vector3f llllIIlIIlIIlIIllIIlIIllI = new Vector3f(0.0f, 0.0f, -1.0f);
    public static Vector3f IlIlIlllllIlIIlIlIlllIlIl = new Vector3f(0.0f, 0.0f, 1.0f);
    public float llIIIIIIIllIIllIlIllIIIIl;
    public float lIIIllIllIIllIlllIlIIlllI;
    public float IlllllIlIIIlIIlIIllIIlIll;

    public static Vector3f lIlIlIlIlIIlIIlIIllIIIIIl(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        if (vector3f3 == null) {
            vector3f3 = new Vector3f();
        }
        vector3f3.llIIIIIIIllIIllIlIllIIIIl = vector3f.llIIIIIIIllIIllIlIllIIIIl - vector3f2.llIIIIIIIllIIllIlIllIIIIl;
        vector3f3.lIIIllIllIIllIlllIlIIlllI = vector3f.lIIIllIllIIllIlllIlIIlllI - vector3f2.lIIIllIllIIllIlllIlIIlllI;
        vector3f3.IlllllIlIIIlIIlIIllIIlIll = vector3f.IlllllIlIIIlIIlIIllIIlIll - vector3f2.IlllllIlIIIlIIlIIllIIlIll;
        return vector3f3;
    }

    public Quaternion lIlIlIlIlIIlIIlIIllIIIIIl(float f) {
        return new Quaternion(this, f, false);
    }

    public float getX() {
        return this.llIIIIIIIllIIllIlIllIIIIl;
    }

    public float getY() {
        return this.lIIIllIllIIllIlllIlIIlllI;
    }

    public float getZ() {
        return this.IlllllIlIIIlIIlIIllIIlIll;
    }

    public void IlllIIIIIIlllIlIIlllIlIIl(float f) {
        this.llIIIIIIIllIIllIlIllIIIIl = f;
    }

    public void lIllIlIIIlIIIIIIIlllIlIll(float f) {
        this.lIIIllIllIIllIlllIlIIlllI = f;
    }

    public void llIlllIIIllllIIlllIllIIIl(float f) {
        this.IlllllIlIIIlIIlIIllIIlIll = f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Vector3f)) {
            return false;
        }
        Vector3f vector3f = (Vector3f)object;
        if (!vector3f.lIlIlIlIlIIlIIlIIllIIIIIl(this)) {
            return false;
        }
        if (Float.compare(this.getX(), vector3f.getX()) != 0) {
            return false;
        }
        if (Float.compare(this.getY(), vector3f.getY()) != 0) {
            return false;
        }
        return Float.compare(this.getZ(), vector3f.getZ()) == 0;
    }

    public boolean lIlIlIlIlIIlIIlIIllIIIIIl(Object object) {
        return object instanceof Vector3f;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + Float.floatToIntBits(this.getX());
        n2 = n2 * 59 + Float.floatToIntBits(this.getY());
        n2 = n2 * 59 + Float.floatToIntBits(this.getZ());
        return n2;
    }

    public String toString() {
        return "Vector3f(x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ")";
    }

    public Vector3f() {
    }

    public Vector3f(float f, float f2, float f3) {
        this.llIIIIIIIllIIllIlIllIIIIl = f;
        this.lIIIllIllIIllIlllIlIIlllI = f2;
        this.IlllllIlIIIlIIlIIllIIlIll = f3;
    }
}