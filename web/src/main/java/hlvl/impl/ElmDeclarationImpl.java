/**
 */
package hlvl.impl;

import hlvl.Declaration;
import hlvl.ElmDeclaration;
import hlvl.HlvlPackage;

import hlvl.proxy.DeclarationAdapter;
import hlvl.proxy.ElmDeclarationProxy;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elm Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getAtt <em>Att</em>}</li>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getInst <em>Inst</em>}</li>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hlvl.impl.ElmDeclarationImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "elmdeclaration")
@XmlSeeAlso({ ElmDeclarationProxy.class, Wrapper.class, DeclarationImpl.class })
public class ElmDeclarationImpl extends EObjectImpl implements ElmDeclaration {
	/**
	 * The default value of the '{@link #getAtt() <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtt() <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt()
	 * @generated
	 * @ordered
	 */
	protected String att = ATT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected static final String INST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected String inst = INST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected Declaration declaration;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElmDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.ELM_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getAtt() {
		return att;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtt(String newAtt) {
		String oldAtt = att;
		att = newAtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__ATT, oldAtt, att));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getInst() {
		return inst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInst(String newInst) {
		String oldInst = inst;
		inst = newInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__INST, oldInst, inst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = DeclarationAdapter.class)
	public Declaration getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs) {
		Declaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.ELM_DECLARATION__DECLARATION, oldDeclaration, newDeclaration);
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
	public void setDeclaration(Declaration newDeclaration) {
		if (newDeclaration != declaration) {
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject) declaration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.ELM_DECLARATION__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject) newDeclaration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.ELM_DECLARATION__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__DECLARATION,
					newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELM_DECLARATION__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.ELM_DECLARATION__DECLARATION:
			return basicSetDeclaration(null, msgs);
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
		case HlvlPackage.ELM_DECLARATION__ATT:
			return getAtt();
		case HlvlPackage.ELM_DECLARATION__INST:
			return getInst();
		case HlvlPackage.ELM_DECLARATION__DATA_TYPE:
			return getDataType();
		case HlvlPackage.ELM_DECLARATION__NAME:
			return getName();
		case HlvlPackage.ELM_DECLARATION__DECLARATION:
			return getDeclaration();
		case HlvlPackage.ELM_DECLARATION__COMMENT:
			return getComment();
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
		case HlvlPackage.ELM_DECLARATION__ATT:
			setAtt((String) newValue);
			return;
		case HlvlPackage.ELM_DECLARATION__INST:
			setInst((String) newValue);
			return;
		case HlvlPackage.ELM_DECLARATION__DATA_TYPE:
			setDataType((String) newValue);
			return;
		case HlvlPackage.ELM_DECLARATION__NAME:
			setName((String) newValue);
			return;
		case HlvlPackage.ELM_DECLARATION__DECLARATION:
			setDeclaration((Declaration) newValue);
			return;
		case HlvlPackage.ELM_DECLARATION__COMMENT:
			setComment((String) newValue);
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
		case HlvlPackage.ELM_DECLARATION__ATT:
			setAtt(ATT_EDEFAULT);
			return;
		case HlvlPackage.ELM_DECLARATION__INST:
			setInst(INST_EDEFAULT);
			return;
		case HlvlPackage.ELM_DECLARATION__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case HlvlPackage.ELM_DECLARATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HlvlPackage.ELM_DECLARATION__DECLARATION:
			setDeclaration((Declaration) null);
			return;
		case HlvlPackage.ELM_DECLARATION__COMMENT:
			setComment(COMMENT_EDEFAULT);
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
		case HlvlPackage.ELM_DECLARATION__ATT:
			return ATT_EDEFAULT == null ? att != null : !ATT_EDEFAULT.equals(att);
		case HlvlPackage.ELM_DECLARATION__INST:
			return INST_EDEFAULT == null ? inst != null : !INST_EDEFAULT.equals(inst);
		case HlvlPackage.ELM_DECLARATION__DATA_TYPE:
			return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
		case HlvlPackage.ELM_DECLARATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HlvlPackage.ELM_DECLARATION__DECLARATION:
			return declaration != null;
		case HlvlPackage.ELM_DECLARATION__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (att: ");
		result.append(att);
		result.append(", inst: ");
		result.append(inst);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ElmDeclarationImpl