/**
 * 类名： package-info <br>
 * 描述：
 *  责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 *  这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 *  这种类型的设计模式属于行为型模式。在这种模式中，通常每个接收者都包含对另一个接收者的引用。
 *  如果一个对象能或不能处理该请求，它都会把相同的请求传给下一个接收者，依此类推，直至责任链结束。 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
package com.scy.pattern.creational.chains;