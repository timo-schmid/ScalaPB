// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.perf.protos

@SerialVersionUID(0L)
final case class Enum(
    color: scalapb.perf.protos.Color = scalapb.perf.protos.Color.UNKNOWN,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Enum] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = color.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value)
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
        val __v = color.value
        if (__v != 0) {
          _output__.writeEnum(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withColor(__v: scalapb.perf.protos.Color): Enum = copy(color = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = color.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(color.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.perf.protos.Enum
}

object Enum extends scalapb.GeneratedMessageCompanion[scalapb.perf.protos.Enum] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.perf.protos.Enum] = this
  override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.Enum = newBuilder.merge(input).result()
  def merge(`_message__`: scalapb.perf.protos.Enum, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.Enum = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.perf.protos.Enum] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.perf.protos.Enum(
        color = scalapb.perf.protos.Color.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(scalapb.perf.protos.Color.UNKNOWN.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProtosProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProtosProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => scalapb.perf.protos.Color
    }
  }
  lazy val defaultInstance = scalapb.perf.protos.Enum(
    color = scalapb.perf.protos.Color.UNKNOWN
  )
  final class Builder private (
    private var __color: scalapb.perf.protos.Color,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.perf.protos.Enum] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __color = scalapb.perf.protos.Color.fromValue(_input__.readEnum())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.perf.protos.Enum = {
      scalapb.perf.protos.Enum(
          color = __color,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.perf.protos.Enum, scalapb.perf.protos.Enum.Builder] {
    def apply(): Builder = new Builder(
      __color = scalapb.perf.protos.Color.UNKNOWN,
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.perf.protos.Enum): Builder = new Builder(
      __color = _message__.color,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.perf.protos.Enum.Builder()
  def newBuilder(a: scalapb.perf.protos.Enum): Builder = scalapb.perf.protos.Enum.Builder(a)
  implicit class EnumLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.Enum]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.perf.protos.Enum](_l) {
    def color: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.Color] = field(_.color)((c_, f_) => c_.copy(color = f_))
  }
  final val COLOR_FIELD_NUMBER = 1
  def of(
    color: scalapb.perf.protos.Color
  ): _root_.scalapb.perf.protos.Enum = _root_.scalapb.perf.protos.Enum(
    color
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.perf.Enum])
}
