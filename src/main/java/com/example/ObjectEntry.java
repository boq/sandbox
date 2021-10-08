package com.example;

import java.util.Objects;

public final class ObjectEntry<K> {
    private final Key<K> key;

    public ObjectEntry(Key<K> key) {
        this.key = key;
    }

    public Key<K> key() {
        return key;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ObjectEntry<?>) obj;
        return Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "ObjectEntry[" +
            "key=" + key + ']';
    }

}
