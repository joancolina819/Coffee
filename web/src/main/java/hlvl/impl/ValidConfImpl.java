/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.ListOfValuation;
import hlvl.ValidConf;

import hlvl.proxy.ListOfValuationAdapter;
import hlvl.proxy.ValidConfProxy;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.ValidConfImpl#getValuations <em>Valuations</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "validconf")
@XmlSeeAlso({ ValidConfProxy.class, Wrapper.class, ListOfValuationImpl.class })
public class ValidConfImpl extends OperationImpl implements ValidConf {
	/**
	 * The cached value of the '{@link #getValuations() <em>Valuations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuations()
	 * @generated
	 * @ordered
	 */
	protected ListOfValuation valuations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.VALID_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ListOfValuationAdapter.class)
	public ListOfValuation getValuations() {
		return valuations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuations(ListOfValuation newValuations, NotificationChain msgs) {
		ListOfValuation oldValuations = valuations;
		valuations = newValuations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.VALID_CONF__VALUATIONS, oldValuations, newValuations);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuations(ListOfValuation newValuations) {
		if (newValuations != valuations) {
			NotificationChain msgs = null;
			if (valuations != null)
				msgs = ((InternalEObject) valuations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VALID_CONF__VALUATIONS, null, msgs);
			if (newValuations != null)
				msgs = ((InternalEObject) newValuations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VALID_CONF__VALUATIONS, null, msgs);
			msgs = basicSetValuations(newValuations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VALID_CONF__VALUATIONS, newValuations,
					newValuations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.VALID_CONF__VALUATIONS:
			return basicSetValuations(null, msgs);
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
		case HlvlPackage.VALID_CONF__VALUATIONS:
			return getValuations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlvlPackage.VALID_CONF__VALUATIONS:
			setValuations((ListOfValuation) newValue);
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
		case HlvlPackage.VALID_CONF__VALUATIONS:
			setValuations((ListOfValuation) null);
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
		case HlvlPackage.VALID_CONF__VALUATIONS:
			return valuations != null;
		}
		return super.eIsSet(featureID);
	}

} //ValidConfImpl