package com.kaleidoscope.core.delta.javabased;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import Delta.DeltaFactory;
import Delta.Edge;

public class JavaBasedEdge {
	EObject src;
	EObject trg;
	EReference type;
	
	public JavaBasedEdge(EObject src, EObject trg, EReference type){
		this.src = src;
		this.trg = trg;
		this.type = type;
	}
	public  JavaBasedEdge(Delta.Edge edgeEMF){
		this.src = edgeEMF.getSrc();
		this.trg = edgeEMF.getTrg();
		this.type = edgeEMF.getType();
	}
	public void setSrc(EObject src){
		this.src = src;
	}
	public void setTrg(EObject trg){
		this.trg = trg;
	}
	public void setType(EReference type){
		this.type = type;
	}
	public EObject getSrc(){
		return src;
	}
	public EObject getTrg(){
		return trg;
	}
	public EReference getType(){
		return type;
	}
	
	public Edge toEMF(){	      
		Edge edge = DeltaFactory.eINSTANCE.createEdge();
		edge.setType(type);
		edge.setSrc(src);
		edge.setTrg(trg);
	      
	    return edge;
	}
	public void fromEMF(Delta.Edge edgeEMF){
		this.src = edgeEMF.getSrc();
		this.trg = edgeEMF.getTrg();
		this.type = edgeEMF.getType();
	}
}
