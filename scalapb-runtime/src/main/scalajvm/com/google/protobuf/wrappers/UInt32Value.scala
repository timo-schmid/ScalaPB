// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

/** Wrapper message for `uint32`.
  *
  * The JSON representation for `UInt32Value` is JSON number.
  *
  * @param value
  *   The uint32 value.
  */
@SerialVersionUID(0L)
final case class UInt32Value(
    value: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UInt32Value] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = value
        if (__v != 0) {
          _output__.writeUInt32(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withValue(__v: _root_.scala.Int): UInt32Value = copy(value = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.UInt32Value
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.UInt32Value])
}

object UInt32Value extends scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt32Value] with scalapb.JavaProtoSupport[com.google.protobuf.wrappers.UInt32Value, com.google.protobuf.UInt32Value] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt32Value] with scalapb.JavaProtoSupport[com.google.protobuf.wrappers.UInt32Value, com.google.protobuf.UInt32Value] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.UInt32Value = newBuilder.merge(input).result()
  def toJavaProto(scalaPbSource: com.google.protobuf.wrappers.UInt32Value): com.google.protobuf.UInt32Value = {
    val javaPbOut = com.google.protobuf.UInt32Value.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.UInt32Value): com.google.protobuf.wrappers.UInt32Value = com.google.protobuf.wrappers.UInt32Value(
    value = javaPbSource.getValue.intValue
  )
  def merge(`_message__`: com.google.protobuf.wrappers.UInt32Value, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.UInt32Value = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.wrappers.UInt32Value] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.UInt32Value(
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes().get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.UInt32Value(
    value = 0
  )
  final class Builder private (
    private var __value: _root_.scala.Int,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.wrappers.UInt32Value] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = _input__.readUInt32()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.wrappers.UInt32Value = {
      com.google.protobuf.wrappers.UInt32Value(
          value = __value,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.wrappers.UInt32Value, com.google.protobuf.wrappers.UInt32Value.Builder] {
    def apply(): Builder = new Builder(
      __value = 0,
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.wrappers.UInt32Value): Builder = new Builder(
      __value = _message__.value,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.wrappers.UInt32Value.Builder()
  def newBuilder(`_message__`: com.google.protobuf.wrappers.UInt32Value): Builder = com.google.protobuf.wrappers.UInt32Value.Builder(_message__)
  implicit class UInt32ValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.wrappers.UInt32Value]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.UInt32Value](_l) {
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
  def of(
    value: _root_.scala.Int
  ): _root_.com.google.protobuf.wrappers.UInt32Value = _root_.com.google.protobuf.wrappers.UInt32Value(
    value
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.UInt32Value])
}
