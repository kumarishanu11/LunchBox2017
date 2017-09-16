package com.weltec.lunchbox.util;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.weltec.lunchbox.entity.Order;
import com.weltec.lunchbox.entity.OrderItem;

public class MapOrder {
	public model.Order convertOrderToJPA(Order order){
		model.Order orderJPA = new model.Order();
		if(order.getCustomerId()!=null && !order.getCustomerId().isEmpty()){
			orderJPA.setCustomerId(order.getCustomerId());
		}
		orderJPA.setOrderId(order.getOrderId());
		if(order.getOrderStatus()!=null && !order.getOrderStatus().isEmpty()){
			orderJPA.setOrderStatusId(order.getOrderStatus());
		}
		if(order.getOrderTime()!=null ){
			orderJPA.setOrderTime(order.getOrderTime());
		}
		
			orderJPA.setTotal(new BigDecimal(order.getTotalCost()));
		if(order.getOrderItems()!=null && !order.getOrderItems().isEmpty()){
			ArrayList<model.OrderItem> orderItemList= new ArrayList<model.OrderItem>();
			for(OrderItem orderItem : order.getOrderItems()){
				
				orderItemList.add(convertOrderItemToJPA(orderItem, order.getOrderId()));
			}
			orderJPA.setOrderItems(orderItemList);
		}
		
		return orderJPA;
		
	}
	
	public model.OrderItem convertOrderItemToJPA(OrderItem orderItem, long orderId){
		model.OrderItem orderItemJPA = new model.OrderItem();
		
		orderItemJPA.setOrderItemId(orderItem.getOrderItemId());
		orderItemJPA.setOrderId(new BigDecimal(orderId));
		orderItemJPA.setFoodItemId(new BigDecimal(orderItem.getFoodItemId()));
		orderItemJPA.setQuantity(new BigDecimal(orderItem.getQuantity()));
		
		return orderItemJPA;
		
	}
	
	public Order convertToOrder(model.Order order){
		Order orderEntiry = new Order();
		if(order.getCustomerId()!=null && !order.getCustomerId().isEmpty()){
			orderEntiry.setCustomerId(order.getCustomerId());
		}
		orderEntiry.setOrderId((int)order.getOrderId());
		if(order.getOrderStatusId()!=null && !order.getOrderStatusId().isEmpty()){
			orderEntiry.setOrderStatus(order.getOrderStatusId());
		}
		if(order.getOrderTime()!=null){
			orderEntiry.setOrderTime(order.getOrderTime());
		}
		orderEntiry.setTotalCost(order.getTotal().floatValue());
		//orderEntiry.setVendorId();
		if(order.getOrderItems()!=null && order.getOrderItems().size()>0){
			ArrayList<OrderItem> orderItemList= new ArrayList<OrderItem>();
			for(model.OrderItem orderItem : order.getOrderItems()){
				orderItemList.add(convertToOrderItem(orderItem));
				orderEntiry.setOrderItems(orderItemList);
			}
		}
		
		return orderEntiry;
		
	}
	
	public OrderItem convertToOrderItem(model.OrderItem orderItem){
		OrderItem orderItemEntity = new OrderItem();
		if((orderItem.getFoodItemId()!=null)){
			orderItemEntity.setFoodItemId(orderItem.getFoodItemId().intValue());
		}
		//orderItemEntity.setFoodItemName();
		orderItemEntity.setOrderItemId((int)orderItem.getOrderItemId());
		if(orderItem.getQuantity()!=null){
			orderItemEntity.setQuantity(orderItem.getQuantity().intValue());
		}
		
		return orderItemEntity;
		
	}
	
	
}
