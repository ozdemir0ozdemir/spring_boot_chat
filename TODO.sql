/*
status = 'sent', 'delivered', 'read', 'deleted'
timestamp = UTC
sender_id = user_id
receiver_id = user_id

messages
    message_id,
    conversation_id,
    content,
    sender_id,
    receiver_id,
    status,
    timestamp

conversations
    conversation_id,
    is_group

conversation_members
    conversation_id,
    user_id

users
    user_id
    username
*/