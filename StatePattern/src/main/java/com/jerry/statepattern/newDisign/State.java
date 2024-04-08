package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:42
 * @注释 新的状态的额接口
 */
public interface State {
    /***
     * 投币
     */
    public void insertMoney();

    /***
     * 退币
     */
    public void returnMoney() ;

    /***
     * 按钮按下
     */
    public void passButton() ;

    /***
     * 分发水
     */
    public void distribute() ;
}
