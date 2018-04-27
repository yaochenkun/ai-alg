/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.bupt.aiop.rpcapi.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-04-27")
public class ImageAlgThriftService {

  public interface Iface {

    public java.lang.String face_sim(java.lang.String img_base64_1, java.lang.String img_base64_2) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void face_sim(java.lang.String img_base64_1, java.lang.String img_base64_2, org.apache.thrift.async.AsyncMethodCallback<java.lang.String> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public java.lang.String face_sim(java.lang.String img_base64_1, java.lang.String img_base64_2) throws org.apache.thrift.TException
    {
      send_face_sim(img_base64_1, img_base64_2);
      return recv_face_sim();
    }

    public void send_face_sim(java.lang.String img_base64_1, java.lang.String img_base64_2) throws org.apache.thrift.TException
    {
      face_sim_args args = new face_sim_args();
      args.setImg_base64_1(img_base64_1);
      args.setImg_base64_2(img_base64_2);
      sendBase("face_sim", args);
    }

    public java.lang.String recv_face_sim() throws org.apache.thrift.TException
    {
      face_sim_result result = new face_sim_result();
      receiveBase(result, "face_sim");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "face_sim failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void face_sim(java.lang.String img_base64_1, java.lang.String img_base64_2, org.apache.thrift.async.AsyncMethodCallback<java.lang.String> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      face_sim_call method_call = new face_sim_call(img_base64_1, img_base64_2, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class face_sim_call extends org.apache.thrift.async.TAsyncMethodCall<java.lang.String> {
      private java.lang.String img_base64_1;
      private java.lang.String img_base64_2;
      public face_sim_call(java.lang.String img_base64_1, java.lang.String img_base64_2, org.apache.thrift.async.AsyncMethodCallback<java.lang.String> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.img_base64_1 = img_base64_1;
        this.img_base64_2 = img_base64_2;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("face_sim", org.apache.thrift.protocol.TMessageType.CALL, 0));
        face_sim_args args = new face_sim_args();
        args.setImg_base64_1(img_base64_1);
        args.setImg_base64_2(img_base64_2);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public java.lang.String getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_face_sim();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("face_sim", new face_sim());
      return processMap;
    }

    public static class face_sim<I extends Iface> extends org.apache.thrift.ProcessFunction<I, face_sim_args> {
      public face_sim() {
        super("face_sim");
      }

      public face_sim_args getEmptyArgsInstance() {
        return new face_sim_args();
      }

      protected boolean isOneway() {
        return false;
      }

      @Override
      protected boolean handleRuntimeExceptions() {
        return false;
      }

      public face_sim_result getResult(I iface, face_sim_args args) throws org.apache.thrift.TException {
        face_sim_result result = new face_sim_result();
        result.success = iface.face_sim(args.img_base64_1, args.img_base64_2);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("face_sim", new face_sim());
      return processMap;
    }

    public static class face_sim<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, face_sim_args, java.lang.String> {
      public face_sim() {
        super("face_sim");
      }

      public face_sim_args getEmptyArgsInstance() {
        return new face_sim_args();
      }

      public org.apache.thrift.async.AsyncMethodCallback<java.lang.String> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<java.lang.String>() { 
          public void onComplete(java.lang.String o) {
            face_sim_result result = new face_sim_result();
            result.success = o;
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            face_sim_result result = new face_sim_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, face_sim_args args, org.apache.thrift.async.AsyncMethodCallback<java.lang.String> resultHandler) throws org.apache.thrift.TException {
        iface.face_sim(args.img_base64_1, args.img_base64_2,resultHandler);
      }
    }

  }

  public static class face_sim_args implements org.apache.thrift.TBase<face_sim_args, face_sim_args._Fields>, java.io.Serializable, Cloneable, Comparable<face_sim_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("face_sim_args");

    private static final org.apache.thrift.protocol.TField IMG_BASE64_1_FIELD_DESC = new org.apache.thrift.protocol.TField("img_base64_1", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField IMG_BASE64_2_FIELD_DESC = new org.apache.thrift.protocol.TField("img_base64_2", org.apache.thrift.protocol.TType.STRING, (short)2);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new face_sim_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new face_sim_argsTupleSchemeFactory();

    public java.lang.String img_base64_1; // required
    public java.lang.String img_base64_2; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      IMG_BASE64_1((short)1, "img_base64_1"),
      IMG_BASE64_2((short)2, "img_base64_2");

      private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

      static {
        for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // IMG_BASE64_1
            return IMG_BASE64_1;
          case 2: // IMG_BASE64_2
            return IMG_BASE64_2;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(java.lang.String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final java.lang.String _fieldName;

      _Fields(short thriftId, java.lang.String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public java.lang.String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.IMG_BASE64_1, new org.apache.thrift.meta_data.FieldMetaData("img_base64_1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.IMG_BASE64_2, new org.apache.thrift.meta_data.FieldMetaData("img_base64_2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(face_sim_args.class, metaDataMap);
    }

    public face_sim_args() {
    }

    public face_sim_args(
      java.lang.String img_base64_1,
      java.lang.String img_base64_2)
    {
      this();
      this.img_base64_1 = img_base64_1;
      this.img_base64_2 = img_base64_2;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public face_sim_args(face_sim_args other) {
      if (other.isSetImg_base64_1()) {
        this.img_base64_1 = other.img_base64_1;
      }
      if (other.isSetImg_base64_2()) {
        this.img_base64_2 = other.img_base64_2;
      }
    }

    public face_sim_args deepCopy() {
      return new face_sim_args(this);
    }

    @Override
    public void clear() {
      this.img_base64_1 = null;
      this.img_base64_2 = null;
    }

    public java.lang.String getImg_base64_1() {
      return this.img_base64_1;
    }

    public face_sim_args setImg_base64_1(java.lang.String img_base64_1) {
      this.img_base64_1 = img_base64_1;
      return this;
    }

    public void unsetImg_base64_1() {
      this.img_base64_1 = null;
    }

    /** Returns true if field img_base64_1 is set (has been assigned a value) and false otherwise */
    public boolean isSetImg_base64_1() {
      return this.img_base64_1 != null;
    }

    public void setImg_base64_1IsSet(boolean value) {
      if (!value) {
        this.img_base64_1 = null;
      }
    }

    public java.lang.String getImg_base64_2() {
      return this.img_base64_2;
    }

    public face_sim_args setImg_base64_2(java.lang.String img_base64_2) {
      this.img_base64_2 = img_base64_2;
      return this;
    }

    public void unsetImg_base64_2() {
      this.img_base64_2 = null;
    }

    /** Returns true if field img_base64_2 is set (has been assigned a value) and false otherwise */
    public boolean isSetImg_base64_2() {
      return this.img_base64_2 != null;
    }

    public void setImg_base64_2IsSet(boolean value) {
      if (!value) {
        this.img_base64_2 = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case IMG_BASE64_1:
        if (value == null) {
          unsetImg_base64_1();
        } else {
          setImg_base64_1((java.lang.String)value);
        }
        break;

      case IMG_BASE64_2:
        if (value == null) {
          unsetImg_base64_2();
        } else {
          setImg_base64_2((java.lang.String)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case IMG_BASE64_1:
        return getImg_base64_1();

      case IMG_BASE64_2:
        return getImg_base64_2();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case IMG_BASE64_1:
        return isSetImg_base64_1();
      case IMG_BASE64_2:
        return isSetImg_base64_2();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof face_sim_args)
        return this.equals((face_sim_args)that);
      return false;
    }

    public boolean equals(face_sim_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_img_base64_1 = true && this.isSetImg_base64_1();
      boolean that_present_img_base64_1 = true && that.isSetImg_base64_1();
      if (this_present_img_base64_1 || that_present_img_base64_1) {
        if (!(this_present_img_base64_1 && that_present_img_base64_1))
          return false;
        if (!this.img_base64_1.equals(that.img_base64_1))
          return false;
      }

      boolean this_present_img_base64_2 = true && this.isSetImg_base64_2();
      boolean that_present_img_base64_2 = true && that.isSetImg_base64_2();
      if (this_present_img_base64_2 || that_present_img_base64_2) {
        if (!(this_present_img_base64_2 && that_present_img_base64_2))
          return false;
        if (!this.img_base64_2.equals(that.img_base64_2))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetImg_base64_1()) ? 131071 : 524287);
      if (isSetImg_base64_1())
        hashCode = hashCode * 8191 + img_base64_1.hashCode();

      hashCode = hashCode * 8191 + ((isSetImg_base64_2()) ? 131071 : 524287);
      if (isSetImg_base64_2())
        hashCode = hashCode * 8191 + img_base64_2.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(face_sim_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetImg_base64_1()).compareTo(other.isSetImg_base64_1());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetImg_base64_1()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.img_base64_1, other.img_base64_1);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = java.lang.Boolean.valueOf(isSetImg_base64_2()).compareTo(other.isSetImg_base64_2());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetImg_base64_2()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.img_base64_2, other.img_base64_2);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("face_sim_args(");
      boolean first = true;

      sb.append("img_base64_1:");
      if (this.img_base64_1 == null) {
        sb.append("null");
      } else {
        sb.append(this.img_base64_1);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("img_base64_2:");
      if (this.img_base64_2 == null) {
        sb.append("null");
      } else {
        sb.append(this.img_base64_2);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class face_sim_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public face_sim_argsStandardScheme getScheme() {
        return new face_sim_argsStandardScheme();
      }
    }

    private static class face_sim_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<face_sim_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, face_sim_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // IMG_BASE64_1
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.img_base64_1 = iprot.readString();
                struct.setImg_base64_1IsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // IMG_BASE64_2
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.img_base64_2 = iprot.readString();
                struct.setImg_base64_2IsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, face_sim_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.img_base64_1 != null) {
          oprot.writeFieldBegin(IMG_BASE64_1_FIELD_DESC);
          oprot.writeString(struct.img_base64_1);
          oprot.writeFieldEnd();
        }
        if (struct.img_base64_2 != null) {
          oprot.writeFieldBegin(IMG_BASE64_2_FIELD_DESC);
          oprot.writeString(struct.img_base64_2);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class face_sim_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public face_sim_argsTupleScheme getScheme() {
        return new face_sim_argsTupleScheme();
      }
    }

    private static class face_sim_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<face_sim_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, face_sim_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetImg_base64_1()) {
          optionals.set(0);
        }
        if (struct.isSetImg_base64_2()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetImg_base64_1()) {
          oprot.writeString(struct.img_base64_1);
        }
        if (struct.isSetImg_base64_2()) {
          oprot.writeString(struct.img_base64_2);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, face_sim_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.img_base64_1 = iprot.readString();
          struct.setImg_base64_1IsSet(true);
        }
        if (incoming.get(1)) {
          struct.img_base64_2 = iprot.readString();
          struct.setImg_base64_2IsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class face_sim_result implements org.apache.thrift.TBase<face_sim_result, face_sim_result._Fields>, java.io.Serializable, Cloneable, Comparable<face_sim_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("face_sim_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRING, (short)0);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new face_sim_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new face_sim_resultTupleSchemeFactory();

    public java.lang.String success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

      static {
        for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(java.lang.String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final java.lang.String _fieldName;

      _Fields(short thriftId, java.lang.String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public java.lang.String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(face_sim_result.class, metaDataMap);
    }

    public face_sim_result() {
    }

    public face_sim_result(
      java.lang.String success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public face_sim_result(face_sim_result other) {
      if (other.isSetSuccess()) {
        this.success = other.success;
      }
    }

    public face_sim_result deepCopy() {
      return new face_sim_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public java.lang.String getSuccess() {
      return this.success;
    }

    public face_sim_result setSuccess(java.lang.String success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((java.lang.String)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof face_sim_result)
        return this.equals((face_sim_result)that);
      return false;
    }

    public boolean equals(face_sim_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetSuccess()) ? 131071 : 524287);
      if (isSetSuccess())
        hashCode = hashCode * 8191 + success.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(face_sim_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
      }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("face_sim_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class face_sim_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public face_sim_resultStandardScheme getScheme() {
        return new face_sim_resultStandardScheme();
      }
    }

    private static class face_sim_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<face_sim_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, face_sim_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.success = iprot.readString();
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, face_sim_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeString(struct.success);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class face_sim_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public face_sim_resultTupleScheme getScheme() {
        return new face_sim_resultTupleScheme();
      }
    }

    private static class face_sim_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<face_sim_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, face_sim_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          oprot.writeString(struct.success);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, face_sim_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = iprot.readString();
          struct.setSuccessIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}