package com.cmpay.sachzhong.utils;

public class SqlValue {

    private String mynode;
    private int betweenStart;
    private int betweenEnd;
    private String mynodeby;
    private String DESCorASC;
    private int IntValue;
    private float floatNode;

    public int getIntValue() {
        return IntValue;
    }

    public void setIntValue(int intValue) {
        IntValue = intValue;
    }



    public SqlValue()
    {

    }

    public SqlValue(String mynode, int betweenStart, int betweenEnd, String mynodeby, String DESCorASC) {
        this.mynode = mynode;
        this.betweenStart = betweenStart;
        this.betweenEnd = betweenEnd;
        this.mynodeby = mynodeby;
        this.DESCorASC = DESCorASC;
    }

    public String getMynode() {
        return mynode;
    }

    public void setMynode(String mynode) {
        this.mynode = mynode;
    }

    public int getBetweenStart() {
        return betweenStart;
    }

    public void setBetweenStart(int betweenStart) {
        this.betweenStart = betweenStart;
    }

    public int getBetweenEnd() {
        return betweenEnd;
    }

    public void setBetweenEnd(int betweenEnd) {
        this.betweenEnd = betweenEnd;
    }

    public String getMynodeby() {
        return mynodeby;
    }

    public void setMynodeby(String mynodeby) {
        this.mynodeby = mynodeby;
    }

    public String getDESCorASC() {
        return DESCorASC;
    }

    public void setDESCorASC(String DESCorASC) {
        this.DESCorASC = DESCorASC;
    }

    public float getFloatNode() {
        return floatNode;
    }

    public void setFloatNode(float floatNode) {
        this.floatNode = floatNode;
    }
}
