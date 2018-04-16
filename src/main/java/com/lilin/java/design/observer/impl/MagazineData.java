/**
 * 
 */
package com.lilin.java.design.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.lilin.java.design.observer.Observer;
import com.lilin.java.design.observer.Observerable;


/**
 * 杂志社
 * 
 * @author lilin
 *
 */
public class MagazineData implements Observerable {

	private List<Observer> observers;// 要通知的人们
	private int edition;// 书本版本号
	private float cost;// 价格

	
	
	public MagazineData() {
		observers = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.lilin.observer.Observerable#registerObserver(com.lilin.observer.Observer
	 * )
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.lilin.observer.Observerable#removeObserver(com.lilin.observer.Observer
	 * )
	 */
	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lilin.observer.Observerable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (Observer i : observers) {
			Observer observer = i;
			observer.update(edition, cost);
		}

	}

	public void setInfomation(int edition, float cost) {
		this.edition = edition;
		this.cost = cost;
		// 信息更新完毕，通知所有观察者
		notifyObservers();

	}

}
