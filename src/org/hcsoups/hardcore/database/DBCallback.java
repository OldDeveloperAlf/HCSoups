package org.hcsoups.hardcore.database;

/**
 * Created by Ryan on 1/25/2015
 * <p/>
 * Project: HCSoups
 */
public interface DBCallback<T> {
    void call(T t);
}
