/**
 */
package hlvl.impl;

import hlvl.ElmDeclaration;
import hlvl.HlvlPackage;
import hlvl.QImplies;

import hlvl.proxy.ElmDeclarationAdapter;
import hlvl.proxy.QImpliesProxy;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QImplies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.QImpliesImpl#getMina <em>Mina</em>}</li>
 *   <li>{@link hlvl.impl.QImpliesImpl#getMaxa <em>Maxa</em>}</li>
 *   <li>{@link hlvl.impl.QImpliesImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link hlvl.impl.QImpliesImpl#getMinb <em>Minb</em>}</li>
 *   <li>{@link hlvl.impl.QImpliesImpl#getMaxb <em>Maxb</em>}</li>
 *   <li>{@link hlvl.impl.QImpliesImpl#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "qimplies")
@XmlSeeAlso({ QImpliesProxy.class, Wrapper.class, ElmDeclarationImpl.class, ElmDeclarationImpl.class })
public class QImpliesImpl extends RelationImpl implements QImplies {
	/**
	 * The default value of the '{@link #getMina() <em>Mina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMina()
	 * @generated
	 * @ordered
	 */
	protected static final int MINA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMina() <em>Mina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMina()
	 * @generated
	 * @ordered
	 */
	protected int mina = MINA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxa() <em>Maxa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxa()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxa() <em>Maxa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxa()
	 * @generated
	 * @ordered
	 */
	protected int maxa = MAXA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVar1() <em>Var1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar1()
	 * @generated
	 * @ordered
	 */
	protected ElmDeclaration var1;

	/**
	 * The default value of the '{@link #getMinb() <em>Minb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinb()
	 * @generated
	 * @ordered
	 */
	protected static final int MINB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinb() <em>Minb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinb()
	 * @generated
	 * @ordered
	 */
	protected int minb = MINB_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxb() <em>Maxb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxb()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxb() <em>Maxb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxb()
	 * @generated
	 * @ordered
	 */
	protected int maxb = MAXB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVar2() <em>Var2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar2()
	 * @generated
	 * @ordered
	 */
	protected ElmDeclaration var2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QImpliesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.QIMPLIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public int getMina() {
		return mina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMina(int newMina) {
		int oldMina = mina;
		mina = newMina;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__MINA, oldMina, mina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public int getMaxa() {
		return maxa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxa(int newMaxa) {
		int oldMaxa = maxa;
		maxa = newMaxa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__MAXA, oldMaxa, maxa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ElmDeclarationAdapter.class)
	public ElmDeclaration getVar1() {
		if (var1 != null && var1.eIsProxy()) {
			InternalEObject oldVar1 = (InternalEObject) var1;
			var1 = (ElmDeclaration) eResolveProxy(oldVar1);
			if (var1 != oldVar1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HlvlPackage.QIMPLIES__VAR1, oldVar1,
							var1));
			}
		}
		return var1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElmDeclaration basicGetVar1() {
		return var1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar1(ElmDeclaration newVar1) {
		ElmDeclaration oldVar1 = var1;
		var1 = newVar1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__VAR1, oldVar1, var1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public int getMinb() {
		return minb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinb(int newMinb) {
		int oldMinb = minb;
		minb = newMinb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__MINB, oldMinb, minb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public int getMaxb() {
		return maxb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxb(int newMaxb) {
		int oldMaxb = maxb;
		maxb = newMaxb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__MAXB, oldMaxb, maxb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ElmDeclarationAdapter.class)
	public ElmDeclaration getVar2() {
		if (var2 != null && var2.eIsProxy()) {
			InternalEObject oldVar2 = (InternalEObject) var2;
			var2 = (ElmDeclaration) eResolveProxy(oldVar2);
			if (var2 != oldVar2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HlvlPackage.QIMPLIES__VAR2, oldVar2,
							var2));
			}
		}
		return var2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElmDeclaration basicGetVar2() {
		return var2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar2(ElmDeclaration newVar2) {
		ElmDeclaration oldVar2 = var2;
		var2 = newVar2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.QIMPLIES__VAR2, oldVar2, var2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HlvlPackage.QIMPLIES__MINA:
			return getMina();
		case HlvlPackage.QIMPLIES__MAXA:
			return getMaxa();
		case HlvlPackage.QIMPLIES__VAR1:
			if (resolve)
				return getVar1();
			return basicGetVar1();
		case HlvlPackage.QIMPLIES__MINB:
			return getMinb();
		case HlvlPackage.QIMPLIES__MAXB:
			return getMaxb();
		case HlvlPackage.QIMPLIES__VAR2:
			if (resolve)
				return getVar2();
			return basicGetVar2();
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
		case HlvlPackage.QIMPLIES__MINA:
			setMina((Integer) newValue);
			return;
		case HlvlPackage.QIMPLIES__MAXA:
			setMaxa((Integer) newValue);
			return;
		case HlvlPackage.QIMPLIES__VAR1:
			setVar1((ElmDeclaration) newValue);
			return;
		case HlvlPackage.QIMPLIES__MINB:
			setMinb((Integer) newValue);
			return;
		case HlvlPackage.QIMPLIES__MAXB:
			setMaxb((Integer) newValue);
			return;
		case HlvlPackage.QIMPLIES__VAR2:
			setVar2((ElmDeclaration) newValue);
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
		case HlvlPackage.QIMPLIES__MINA:
			setMina(MINA_EDEFAULT);
			return;
		case HlvlPackage.QIMPLIES__MAXA:
			setMaxa(MAXA_EDEFAULT);
			return;
		case HlvlPackage.QIMPLIES__VAR1:
			setVar1((ElmDeclaration) null);
			return;
		case HlvlPackage.QIMPLIES__MINB:
			setMinb(MINB_EDEFAULT);
			return;
		case HlvlPackage.QIMPLIES__MAXB:
			setMaxb(MAXB_EDEFAULT);
			return;
		case HlvlPackage.QIMPLIES__VAR2:
			setVar2((ElmDeclaration) null);
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
		case HlvlPackage.QIMPLIES__MINA:
			return mina != MINA_EDEFAULT;
		case HlvlPackage.QIMPLIES__MAXA:
			return maxa != MAXA_EDEFAULT;
		case HlvlPackage.QIMPLIES__VAR1:
			return var1 != null;
		case HlvlPackage.QIMPLIES__MINB:
			return minb != MINB_EDEFAULT;
		case HlvlPackage.QIMPLIES__MAXB:
			return maxb != MAXB_EDEFAULT;
		case HlvlPackage.QIMPLIES__VAR2:
			return var2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mina: ");
		result.append(mina);
		result.append(", maxa: ");
		result.append(maxa);
		result.append(", minb: ");
		result.append(minb);
		result.append(", maxb: ");
		result.append(maxb);
		result.append(')');
		return result.toString();
	}

} //QImpliesImpl