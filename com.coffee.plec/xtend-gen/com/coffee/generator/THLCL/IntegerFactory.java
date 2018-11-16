package com.coffee.generator.THLCL;

import com.coffee.generator.AttributesFactory;
import com.coffee.generator.FODAFactory;
import com.coffee.generator.THLCL.THLCLFactory;
import com.coffee.pLEC.Assignment;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.coffee.pLEC.VariantsEnumeration;
import com.coffee.pLEC.VariantsInterval;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IntegerFactory extends THLCLFactory implements FODAFactory, AttributesFactory {
  /**
   * List with the constraints autogenerated for dealing with feature instances
   */
  private ArrayList<String> clonConstraints;
  
  public IntegerFactory() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.clonConstraints = _arrayList;
  }
  
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(" ");
    CharSequence _valuesDeclaration = this.getValuesDeclaration(variable, variable.getVariants());
    _builder.append(_valuesDeclaration);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Method for declare variants
   */
  @Override
  public CharSequence getValuesDeclaration(final VarDeclaration variable, final VariantDeclaration variant) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _type = variable.getType();
      boolean _equals = Objects.equal(_type, "boolean");
      if (_equals) {
      } else {
        {
          if ((variant instanceof VariantsInterval)) {
            _builder.append("domain: ");
            int _value = ((VariantsInterval)variant).getStart().getValue();
            _builder.append(_value);
            _builder.append("..");
            int _value_1 = ((VariantsInterval)variant).getEnd().getValue();
            _builder.append(_value_1);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((variant instanceof VariantsEnumeration)) {
                _builder.append("domain: [");
                String _list = this.getList(((VariantsEnumeration)variant).getList().getValues());
                _builder.append(_list);
                _builder.append("]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String getList(final EList<Value> l) {
    Value _get = l.get(0);
    int _value = ((com.coffee.pLEC.Number) _get).getValue();
    String out = (Integer.valueOf(_value) + "");
    for (int i = 1; (i < l.size()); i = (i + 1)) {
      String _out = out;
      Value _get_1 = l.get(i);
      int _value_1 = ((com.coffee.pLEC.Number) _get_1).getValue();
      String _plus = (", " + Integer.valueOf(_value_1));
      out = (_out + _plus);
    }
    return out;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String idsSum = "";
      String implies = "";
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for (final VarDeclaration child : _ids) {
        {
          String _implies = implies;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("(");
          String _name = child.getName();
          _builder.append(_name);
          _builder.append(" => ");
          String _name_1 = exp.getParent().getName();
          _builder.append(_name_1);
          _builder.append(") AND ");
          implies = (_implies + _builder);
          String _idsSum = idsSum;
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_2 = child.getName();
          _builder_1.append(_name_2);
          _builder_1.append(" + ");
          idsSum = (_idsSum + _builder_1);
          parents.put(child.getName(), exp.getParent());
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      int _length = idsSum.length();
      int _minus = (_length - 2);
      String _substring = idsSum.substring(0, _minus);
      _builder.append(_substring);
      _builder.append(" <= ");
      int _value = exp.getMin().getValue();
      _builder.append(_value);
      _builder.append(" )");
      String sumLesThan = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("(");
      int _length_1 = idsSum.length();
      int _minus_1 = (_length_1 - 2);
      String _substring_1 = idsSum.substring(0, _minus_1);
      _builder_1.append(_substring_1);
      _builder_1.append(" >= ");
      int _value_1 = exp.getMax().getValue();
      _builder_1.append(_value_1);
      _builder_1.append(")");
      String sumGreaterThan = _builder_1.toString();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(implies);
      _builder_2.append("(");
      String _name = exp.getParent().getName();
      _builder_2.append(_name);
      _builder_2.append(" >= 1) => (");
      _builder_2.append(sumLesThan);
      _builder_2.append(" AND ");
      _builder_2.append(sumGreaterThan);
      _builder_2.append(")");
      String output = _builder_2.toString();
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    String _name = parent.getName();
    String _plus = (_name + " = ");
    String _name_1 = child.getName();
    return (_plus + _name_1);
  }
  
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    String _name = parent.getName();
    String _plus = (_name + " >= ");
    String _name_1 = child.getName();
    return (_plus + _name_1);
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((left.getMin() == null) && (left.getMax() == null))) {
        String _name = left.getName();
        _builder.append(_name);
        _builder.append("  => (");
        String _name_1 = right.getName();
        _builder.append(_name_1);
        _builder.append(" > 1) ");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_2 = left.getName();
        String _plus = ("(" + _name_2);
        String _plus_1 = (_plus + "1");
        String _plus_2 = (_plus_1 + " => ");
        String _name_3 = right.getName();
        String _plus_3 = (_plus_2 + _name_3);
        String declaration = (_plus_3 + ")");
        _builder.newLineIfNotEmpty();
        for (int i = 2; (i <= left.getMax().getValue()); i = (i + 1)) {
          String _declaration = declaration;
          String _name_4 = left.getName();
          String _plus_4 = (" AND (" + _name_4);
          String _plus_5 = (_plus_4 + Integer.valueOf(i));
          String _plus_6 = (_plus_5 + " => ");
          String _name_5 = right.getName();
          String _plus_7 = (_plus_6 + _name_5);
          String _plus_8 = (_plus_7 + ")");
          declaration = (_declaration + _plus_8);
        }
        _builder.newLineIfNotEmpty();
        _builder.append(declaration);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((left.getMin() == null) && (left.getMax() == null))) {
        String _name = left.getName();
        _builder.append(_name);
        _builder.append(" + ");
        String _name_1 = right.getName();
        _builder.append(_name_1);
        _builder.append("<= 1 ");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_2 = left.getName();
        String _plus = ("(" + _name_2);
        String _plus_1 = (_plus + "1");
        String _plus_2 = (_plus_1 + " + ");
        String _name_3 = right.getName();
        String _plus_3 = (_plus_2 + _name_3);
        String declaration = (_plus_3 + "<= 1)");
        _builder.newLineIfNotEmpty();
        for (int i = 2; (i <= left.getMax().getValue()); i = (i + 1)) {
          String _declaration = declaration;
          String _name_4 = left.getName();
          String _plus_4 = (" AND (" + _name_4);
          String _plus_5 = (_plus_4 + Integer.valueOf(i));
          String _plus_6 = (_plus_5 + " + ");
          String _name_5 = right.getName();
          String _plus_7 = (_plus_6 + _name_5);
          String _plus_8 = (_plus_7 + "<= 1)");
          declaration = (_declaration + _plus_8);
        }
        _builder.newLineIfNotEmpty();
        _builder.append(declaration);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * For each attribute in the expression exp a constraint of the
   * type element <=> («attribute» > 0) is generated
   * @param exp is an expression of Type Attributes
   * Falta considerar el caso cuando hay más de un atributo,
   * es decir cuando la lista tiene más de un elemento
   */
  @Override
  public CharSequence getAttributes(final Attributes exp) {
    StringConcatenation _builder = new StringConcatenation();
    final String left = exp.getVar1().getName();
    _builder.newLineIfNotEmpty();
    {
      EList<VarDeclaration> _ids = exp.getAtt().getIds();
      for(final VarDeclaration att : _ids) {
        _builder.append(left);
        _builder.append(" <=> (");
        String _name = att.getName();
        _builder.append(_name);
        _builder.append(" > 0)");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * ================================================================
   * Methods from the cardinalityFactory Interface
   */
  @Override
  public CharSequence getAssignement(final Assignment exp) {
    CharSequence _xblockexpression = null;
    {
      String output = "";
      StringConcatenation _builder = new StringConcatenation();
      String _name = exp.getVariable().getName();
      _builder.append(_name);
      _builder.append(" = ");
      Value _valu = exp.getValu();
      int _value = ((com.coffee.pLEC.Number) _valu).getValue();
      _builder.append(_value);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
