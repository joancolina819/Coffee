/**
 */
package hlvl.impl;

import hlvl.ElmDeclaration;
import hlvl.Hierarchy;
import hlvl.HlvlPackage;
import hlvl.ListOfIDs;

import hlvl.proxy.ElmDeclarationAdapter;
import hlvl.proxy.HierarchyProxy;
import hlvl.proxy.ListOfIDsAdapter;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.HierarchyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link hlvl.impl.HierarchyImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "hierarchy")
@XmlSeeAlso({ HierarchyProxy.class, Wrapper.class, ElmDeclarationImpl.class, ListOfIDsImpl.class,
		DecompositionImpl.class, GroupImpl.class })
public class HierarchyImpl extends RelationImpl implements Hierarchy {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ElmDeclaration parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected ListOfIDs children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ElmDeclarationAdapter.class)
	@XmlElementRefs({

			@XmlElementRef(name = "Decomposition", type = DecompositionImpl.class),

			@XmlElementRef(name = "Group", type = GroupImpl.class)

	})
	public ElmDeclaration getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (ElmDeclaration) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HlvlPackage.HIERARCHY__PARENT, oldParent,
							parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElmDeclaration basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ElmDeclaration newParent) {
		ElmDeclaration oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.HIERARCHY__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ListOfIDsAdapter.class)
	@XmlElementRefs({

			@XmlElementRef(name = "Decomposition", type = DecompositionImpl.class),

			@XmlElementRef(name = "Group", type = GroupImpl.class)

	})
	public ListOfIDs getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildren(ListOfIDs newChildren, NotificationChain msgs) {
		ListOfIDs oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.HIERARCHY__CHILDREN, oldChildren, newChildren);
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
	public void setChildren(ListOfIDs newChildren) {
		if (newChildren != children) {
			NotificationChain msgs = null;
			if (children != null)
				msgs = ((InternalEObject) children).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.HIERARCHY__CHILDREN, null, msgs);
			if (newChildren != null)
				msgs = ((InternalEObject) newChildren).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.HIERARCHY__CHILDREN, null, msgs);
			msgs = basicSetChildren(newChildren, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.HIERARCHY__CHILDREN, newChildren,
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
		case HlvlPackage.HIERARCHY__CHILDREN:
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
		case HlvlPackage.HIERARCHY__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case HlvlPackage.HIERARCHY__CHILDREN:
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
		case HlvlPackage.HIERARCHY__PARENT:
			setParent((ElmDeclaration) newValue);
			return;
		case HlvlPackage.HIERARCHY__CHILDREN:
			setChildren((ListOfIDs) newValue);
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
		case HlvlPackage.HIERARCHY__PARENT:
			setParent((ElmDeclaration) null);
			return;
		case HlvlPackage.HIERARCHY__CHILDREN:
			setChildren((ListOfIDs) null);
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
		case HlvlPackage.HIERARCHY__PARENT:
			return parent != null;
		case HlvlPackage.HIERARCHY__CHILDREN:
			return children != null;
		}
		return super.eIsSet(featureID);
	}

} //HierarchyImpl