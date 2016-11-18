package com.loner.ioc.element;

/**
 * 这里是节点元素，比如ref节点，value等节点都是继承这个接口
 * @author pengcheng.tian
 *
 */
public interface LeafElement {
	/**
	 * 得到节点的类型返回一个字符串
	 * @return
	 */
	public String getType();
	/**
	 * 得到节点的value，也就是节点标签开始和结束之间的值
	 * @return
	 */
	public Object getValue();
}
