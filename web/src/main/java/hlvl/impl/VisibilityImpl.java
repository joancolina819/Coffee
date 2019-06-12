/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.ListOfRelRefs;
import hlvl.Relational;
import hlvl.Visibility;

import hlvl.proxy.ListOfRelRefsAdapter;
import hlvl.proxy.RelationalAdapter;
import hlvl.proxy.VisibilityProxy;

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
 * An implementation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.VisibilityImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hlvl.impl.VisibilityImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "visibility")
@XmlSeeAlso({ VisibilityProxy.class, Wrapper.class, RelationalImpl.class, ListOfRelRefsImpl.class })
public class VisibilityImpl extends RelationImpl implements Visibility {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Relational condition;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected ListOfRelRefs children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.VISIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = RelationalAdapter.class)
	public Relational getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Relational newCondition, NotificationChain msgs) {
		Relational oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.VISIBILITY__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Relational newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VISIBILITY__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VISIBILITY__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VISIBILITY__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ListOfRelRefsAdapter.class)
	public ListOfRelRefs getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildren(ListOfRelRefs newChildren, NotificationChain msgs) {
		ListOfRelRefs oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.VISIBILITY__CHILDREN, oldChildren, newChildren);
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
	public void setChildren(ListOfRelRefs newChildren) {
		if (newChildren != children) {
			NotificationChain msgs = null;
			if (children != null)
				msgs = ((InternalEObject) children).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VISIBILITY__CHILDREN, null, msgs);
			if (newChildren != null)
				msgs = ((InternalEObject) newChildren).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VISIBILITY__CHILDREN, null, msgs);
			msgs = basicSetChildren(newChildren, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VISIBILITY__CHILDREN, newChildren,
					newChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.VISIBILITY__CONDITION:
			return basicSetCondition(null, msgs);
		case HlvlPackage.VISIBILITY__CHILDREN:
			return basicSetChildren(null, msgs);
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
		case HlvlPackage.VISIBILITY__CONDITION:
			return getCondition();
		case HlvlPackage.VISIBILITY__CHILDREN:
			return getChildren();
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
		case HlvlPackage.VISIBILITY__CONDITION:
			setCondition((Relational) newValue);
			return;
		case HlvlPackage.VISIBILITY__CHILDREN:
			setChildren((ListOfRelRefs) newValue);
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
		case HlvlPackage.VISIBILITY__CONDITION:
			setCondition((Relational) null);
			return;
		case HlvlPackage.VISIBILITY__CHILDREN:
			setChildren((ListOfRelRefs) null);
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
		case HlvlPackage.VISIBILITY__CONDITION:
			return condition != null;
		case HlvlPackage.VISIBILITY__CHILDREN:
			return children != null;
		}
		return super.eIsSet(featureID);
	}

} //VisibilityImpl