/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.ListOfValuation;
import hlvl.Valuation;

import hlvl.proxy.ListOfValuationProxy;
import hlvl.proxy.ValuationAdapter;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.ListOfValuationImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "listofvaluation")
@XmlSeeAlso({ ListOfValuationProxy.class, Wrapper.class, ValuationImpl.class })
public class ListOfValuationImpl extends EObjectImpl implements ListOfValuation {
	/**
	 * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<Valuation> pairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfValuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.LIST_OF_VALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElementWrapper(name = "pairs")
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ValuationAdapter.class)
	public EList<Valuation> getPairs() {
		if (pairs == null) {
			pairs = new EObjectContainmentEList<Valuation>(Valuation.class, this, HlvlPackage.LIST_OF_VALUATION__PAIRS);
		}
		return pairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_VALUATION__PAIRS:
			return ((InternalEList<?>) getPairs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_VALUATION__PAIRS:
			return getPairs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_VALUATION__PAIRS:
			getPairs().clear();
			getPairs().addAll((Collection<? extends Valuation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_VALUATION__PAIRS:
			getPairs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_VALUATION__PAIRS:
			return pairs != null && !pairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfValuationImpl