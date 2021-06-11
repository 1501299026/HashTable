package com.myhashmap;

public interface INode <k>{

    K getKey();
    void  setKey(K key);
    INode getNext();
    void  setNext(INode next);
}
