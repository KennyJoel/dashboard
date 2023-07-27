package com.example.dashboard.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface EntityMapper<D,E>{
    D toDto(E e);
    default List<D> toDtos(List<E> e) {
        return e.stream().map(this::toDto).collect(Collectors.toList());
    }

}